package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PaymentService {

    private final CustomerRepository customerRepository;
    private final TransactionRepository transactionRepository;

    public PaymentService(CustomerRepository customerRepository, TransactionRepository transactionRepository) {
        this.customerRepository = customerRepository;
        this.transactionRepository = transactionRepository;
    }

    @Transactional
    public TransactionResponseDTO processPayment(TransactionRequestDTO request) {
        log.info("Iniciando procesamiento de pago. Tarjeta: {}, Monto: {}", request.getCreditCardNumber(), request.getAmount());

        Customer customer = customerRepository.findById(request.getCustomerId()).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        Transaction tx = new Transaction();
        tx.setAmount(request.getAmount());
        tx.setCreditCardNumber(request.getCreditCardNumber());
        tx.setStatus("APPROVED");
        tx.setCustomer(customer);

        transactionRepository.save(tx);

        return new TransactionResponseDTO(tx.getId(), tx.getStatus());
    }

    @Transactional(readOnly = true)
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }
    
}
