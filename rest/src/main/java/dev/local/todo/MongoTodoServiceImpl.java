package dev.local.todo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: zxm
 * @CreateDate: 2018/7/10 10:55
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class MongoTodoServiceImpl implements TodoService {

    private  final TodoRepository repository;

    @Autowired
    public MongoTodoServiceImpl(TodoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Todo addTodo(Todo todo) {
        return repository.insert(todo);
    }

    @Override
    public Todo deleteTodo(String id) {
        Todo deletedTodo = repository.findOne(id);
        repository.delete(id);
        return deletedTodo;
    }

    @Override
    public List<Todo> findAll(String userId) {
        return repository.findByUserId(new ObjectId(userId));
    }

    @Override
    public Todo findById(String id) {
        return repository.findOne(id);
    }

    @Override
    public Todo update(Todo todo) {
        repository.save(todo);
        return todo;
    }
}
