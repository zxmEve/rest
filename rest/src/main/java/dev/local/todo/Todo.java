package dev.local.todo;

import org.springframework.data.annotation.Id;

/**
 * @Description: java类作用描述
 * @Author: zxm
 * @CreateDate: 2018/7/9 21:13
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Todo {
    @Id
    private String id;
    private String desc;
    private boolean completed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
