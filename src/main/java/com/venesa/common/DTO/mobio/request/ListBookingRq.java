package com.venesa.common.DTO.mobio.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListBookingRq implements Serializable {
    private List<BookingDTO> booking;
}
