package in.bhushansirgur.onlinebookstore.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.bhushansirgur.onlinebookstore.entity.Book;

@CrossOrigin("http://localhost:4200")
public interface BookRepositary extends JpaRepository<Book, Long>{

}
