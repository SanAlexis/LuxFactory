/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsoft.app.repository.search;

import com.tsoft.app.domain.Produit;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 *
 * @author tchipi
 */
/**
 * Spring Data JPA repository for the Produit entity.
 */
public interface ProduitSearchRepository extends ElasticsearchRepository<Produit, Long> {

    

}




