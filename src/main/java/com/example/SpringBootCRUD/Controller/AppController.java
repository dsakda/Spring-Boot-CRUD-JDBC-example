package com.example.SpringBootCRUD.Controller;

import com.example.SpringBootCRUD.SaleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {

    @Autowired
    private SaleDAO dao;
}
