package com.example.tickets.model.entity

import com.google.gson.annotations.SerializedName


data class Flight(
    @SerializedName("departure_location")
    val departureLocation: Location,

    @SerializedName("arrival_location")
    val arrivalLocation: Location,

    @SerializedName("departure_time_info")
    val departureTimeInfo: String,

    @SerializedName("arrival_time_info")
    val arrivalTimeInfo: String,

    @SerializedName("flight_number")
    val flightNumber: String,

    @SerializedName("airline")
    val airline: Airline,

    @SerializedName("duration")
    val duration: Int
)