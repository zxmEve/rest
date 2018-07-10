package dev.local.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: zxm
 * @CreateDate: 2018/7/9 21:16
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@RestController
@RequestMapping("/todos")
public class TodoController {

    private TodoService service;

    @Autowired
    public TodoController(TodoService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST)
    Todo addTodo(@RequestBody Todo addedTodo){
        return  service.addTodo(addedTodo);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Todo> getAllTodos(@RequestHeader(value = "userId")String userId){
        return  service.findAll(userId);
    }
    @RequestMapping(value = {"/main"},produces = "application/json;charset=utf-8",
            method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String main(){
        return "hello";
    }
//    @RequestMapping("/todo")
//    public List<Todo> getAllTodos(){
//        List<Todo> todos= new ArrayList<>();
//        Todo item1 = new Todo();
//        item1.setId("1");
//        item1.setCompleted(false);
//        item1.setDesc("gogogo");
//        todos.add(item1);
//        Todo item2 = new Todo();
//        item2.setId("1");
//        item2.setCompleted(true);
//        item2.setDesc("go for lunch");
//        todos.add(item2);
//        return todos;
//    }
}
