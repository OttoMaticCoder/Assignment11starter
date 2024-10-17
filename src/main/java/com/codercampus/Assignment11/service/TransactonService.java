package com.codercampus.Assignment11.service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class TransactonService {
    @Autowired
    private TransactionRepository transactionRepo;

    public Transaction findById(Integer transactionId) {
        return transactionRepo.findById(transactionId);
    }
    public List<Transaction> findAll() {
        List<Transaction> transactions = transactionRepo.findAll();
        transactions.sort(Comparator.comparing(Transaction::getDate));
        return transactions;
    }

}
