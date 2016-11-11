/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.dto;

import com.client.service.Bulk;
import com.marksmana.info.Information;
import com.marksmana.utils.Json;

/**
 *
 * @author Giang
 */
public class BulkDTO {
    private Bulk b;

    public BulkDTO() {
    }

    public BulkDTO(Bulk b) {
        this.b = b;
    }

    public Bulk getBulk() {
        return b;
    }

    public void setBulk(Bulk b) {
        this.b = b;
    }

    public Integer getId() {
        return b.getId();
    }

    public void setId(Integer id) {
        b.setId(id);
    }

    public Information getInfo() throws Exception {
        return Json.DeserializeObject(b.getInfo(), Information.class);
    }

    public void setInfo(Information i) throws Exception {
        String info = Json.SerializeObject(i);
        b.setInfo(info);
    }

    public String getName() {
        return b.getName();
    }

    public void setName(String name) {
        b.setName(name);
    }

    @Override
    public String toString() {
        return b.getName();
    }
    
    
}
