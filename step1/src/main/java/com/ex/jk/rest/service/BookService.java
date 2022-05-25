package com.ex.jk.rest.service;

import com.ex.jk.dto.MBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    public List<MBook> getBookList() {
        List<MBook> MBooks = new ArrayList<>();
        MBooks.add(new MBook("AAAA_001", "BBBB1", "2022-01-01", 1100));
        MBooks.add(new MBook("BBBB_AAAA", "BBBB2", "2022-02-02", 1200));
        MBooks.add(new MBook("CCCC_AAAA", "BBBB3", "2022-03-04", 1300));
        MBooks.add(new MBook("DDDD_AAAA", "BBBB4", "2022-04-04", 1400));

        return MBooks;
    }
}
