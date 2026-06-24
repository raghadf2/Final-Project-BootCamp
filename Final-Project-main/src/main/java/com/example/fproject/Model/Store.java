package com.example.fproject.Model;

import com.example.fproject.Enum.StoreStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stores")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String businessType;

    @Column(nullable = false, unique = true)
    private String commercialRegisterNo;

    @Column(nullable = false)
    private Boolean commercialRegisterVerified = false;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StoreStatus status;

    @ManyToOne
    @JoinColumn(name = "store_owner_id")
    private StoreOwner storeOwner;

    @OneToMany(mappedBy = "store")
    @JsonIgnore
    private Set<Branch> branches;
}