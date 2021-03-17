package com.anma.sb.sbkotlinnext

import org.springframework.data.jpa.repository.JpaRepository

interface DogRepository : JpaRepository<Dog, Long>