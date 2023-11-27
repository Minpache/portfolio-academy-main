package www.dream.bbs.News.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import www.dream.bbs.News.model.NewsVO;

public interface NewsRepository extends JpaRepository<NewsVO, String>{
	@Query(nativeQuery = true, value="SELECT * from news_crawling")
	List<NewsVO> listAll();
}
