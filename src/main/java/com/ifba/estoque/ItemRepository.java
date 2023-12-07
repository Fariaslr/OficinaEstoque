/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.estoque;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaPersistableEntityInformation;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aluno
 */
@Repository
public interface ItemRepository extends JpaRepository<ItemModel, Long> {      }
    

