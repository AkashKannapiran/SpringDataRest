package com.AkashKannapiran.SpringDataRest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class JobPost {
    @Id
    private int postID;
    private String postProfile;
    private String postDesc;
    private int reqExp;
    private List<String> postTechStack;

}
