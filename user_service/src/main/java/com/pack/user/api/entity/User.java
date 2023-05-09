package com.pack.user.api.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String userId;
    private Long userCode;
    private String name;
    private String email;
    private String mobile;
    private String username;
    private boolean isCreating = true;
    private boolean isUpdating = false;
    private Date createDate;
    private String createdDate;
    private Date updateDate;
    private String updatedDate;
    private String updateCount;
    private String initiativeId;
    private String initiativeName;
    private String userUniqueCode;

}
