package com.karzkowiak.ocrsystem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface GraphicRepository extends CrudRepository<Graphic, Integer> {
}
