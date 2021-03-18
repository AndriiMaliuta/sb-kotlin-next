package com.anma.sb.sbkotlinnext

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "dogs")
@Entity
data class Dog(var name: String,
               var age: Int,
               var born: Date,
               @Id var id: UUID
)