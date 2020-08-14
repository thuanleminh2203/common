package com.venesa.common.DTO.mobio.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListBookingRes implements Serializable {
    private List<BookingRes> booking;






}
