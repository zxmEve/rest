package dev.local.todo;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: zxm
 * @CreateDate: 2018/7/10 10:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface TodoService {
    Todo addTodo(Todo todo);
    Todo deleteTodo(String id);
    List<Todo> findAll(String userId);
    Todo findById(String id);
    Todo update(Todo todo);
}
