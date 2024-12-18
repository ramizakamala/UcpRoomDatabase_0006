package com.example.ucp2crud.Data.entity

@Entity(tableName = "dokter")
data class Dokter(
    @Primarykey
    val id: String,
    val nama: String,
    val spesialis: String,
    val klinik: String,
    val jamKerja: String
) {
    annotation class Primarykey
}

annotation class Entity
