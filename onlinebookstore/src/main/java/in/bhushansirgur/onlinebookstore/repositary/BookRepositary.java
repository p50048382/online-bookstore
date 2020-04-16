package in.bhushansirgur.onlinebookstore.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bhushansirgur.onlinebookstore.entity.Book;


public interface BookRepositary extends JpaRepository<Book, Long>{

}
