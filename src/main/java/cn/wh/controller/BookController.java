package cn.wh.controller;

import cn.wh.entity.Book;
import cn.wh.service.IBookService;
import cn.wh.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class BookController  {
    //注入service
    @Resource(name = "IBookService")
    private  IBookService service;
    public IBookService getService() {
        return service;
    }
    public void setService(IBookService service) {
        this.service = service;
    }
    /**
     * 增加测试修改
     * @param book
     * @param model
     * @return
     */
    //水水水水
    @RequestMapping("/dologin")
    public String doPost(Book book, Model model) {
        int i = service.addBook(book);
        //model.addAttribute("message",service.list());
            if (i>0){

                return "forward:/pagelimit";
            }else{
                return "addBook";
            }
    }
    /**
     * 删除
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/dodelete")

    public String dodelete(Integer id, Model model){

        int delete = service.delete(id);
        if (delete>0){
            model.addAttribute("message",service.list());
            return "index";
        }else {
            return "addBook";
        }
    }
    /**
     * 修改
     * @param book
     * @param model
     * @return
     */
    @RequestMapping("/update")
    public  String doUpdate(Book book, Model model){
        int update = service.update(book);
        if (update>0){
            model.addAttribute("message",service.list());
            return "index";
        }else {
            return "updateBook";
        }

    }
    /**
     * 查询列表
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/selectbook")
    public  String doSelectBook(Integer id, Model model){
        Book book = service.book(id);
        model.addAttribute("book",book);
        return "updateBook";
    }
    @RequestMapping("/pagelimit")
    public String doPageLimit(Integer pageindex,Model model){

        PageUtil pageUti = new PageUtil();
        pageUti.setPageSize(3);
        // 当前的页数
        int pageindex1 = 1;
        if (pageindex != null && !pageindex.equals("")) {
            pageindex1 = Integer.valueOf(pageindex);
        }
        pageUti.setPageindex(pageindex1);
        int count = service.count();
        pageUti.setTotalRecords(count);
        // 总页数
        int totapage = pageUti.getTotalRecords() % pageUti.getPageSize() == 0 ? pageUti
                .getTotalRecords() / pageUti.getPageSize()
                : pageUti.getTotalRecords() / pageUti.getPageSize() + 1;
        List<Book> bookList = service.getBookList(pageUti.getPageindex(), pageUti.getPageSize());
        pageUti.setTotalpages(totapage);
        pageUti.setList(bookList);
        model.addAttribute("message",pageUti);
        return "index";
    }
}
