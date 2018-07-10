package dev.local.todo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: zxm
 * @CreateDate: 2018/7/9 21:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Repository
public interface TodoRepository extends MongoRepository<Todo,String> {
    @Override
    List<Todo> findAll();
//
    List<Todo> findByUserId(ObjectId userId);
    Todo findOne(String id);
    void delete(String id);

}
