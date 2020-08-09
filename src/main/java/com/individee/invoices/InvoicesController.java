package com.individee.invoices;

import com.individee.invoices.models.Invoices;
import com.individee.invoices.repositories.InvoicesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/invoice")


public class InvoicesController {
    @Autowired
    private InvoicesRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Invoices> getAllInvoices() {
        return repository.findAll();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoices getInvoiceById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }
    @GetMapping(value = "/download/{id}")
    public ResponseEntity<byte[]> downloadInvoicePDF(@PathVariable ObjectId id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        return new ResponseEntity<>(repository.findBy_id(id).getFile(), headers, HttpStatus.OK);
    }
}
