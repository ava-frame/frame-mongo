package com.ava.frame.mongo;



import com.ava.frame.core.type.Status;
import com.ava.frame.core.utils.UUIDUtils;

import java.io.Serializable;
import java.util.Date;

public class Basic implements Serializable {


    private Long createAt = new Date().getTime() / 1000;

    private Long updateAt = new Date().getTime() / 1000;
    private Status status = Status.active;
    protected String uuid = UUIDUtils.uuid();


    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
