package com.movie.ticket.booking.system.service;

import com.movie.ticket.booking.system.commons.dto.BookingDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface BookingService {
    public BookingDTO createBooking(BookingDTO bookingDTO);
    public void processBooking(BookingDTO bookingDTO);
}
