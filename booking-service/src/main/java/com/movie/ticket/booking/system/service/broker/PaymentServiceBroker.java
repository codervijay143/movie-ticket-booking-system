package com.movie.ticket.booking.system.service.broker;

import com.movie.ticket.booking.system.commons.dto.BookingDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="payment-service")
public interface PaymentServiceBroker {

	@PostMapping("/payments")
    public BookingDTO makePayment(BookingDTO bookingDTO);
}
