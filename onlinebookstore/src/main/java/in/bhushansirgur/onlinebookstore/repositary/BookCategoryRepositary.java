package in.bhushansirgur.onlinebookstore.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.bhushansirgur.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCategory",path="book-category")

public interface BookCategoryRepositary extends JpaRepository<BookCategory, Long> {

}
