package www.dream.bbs.News.controller;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import www.dream.bbs.News.model.NewsVO;
import www.dream.bbs.News.service.NewsService;
import www.dream.bbs.shelter.model.ShelterVO;

@RestController		//Container에 담기도록 지정
@RequestMapping("/news")
public class NewsController {
	@Autowired
	private NewsService newsService;
		
	// 크롤링한 기사 헤드라인을 출력함.
	@GetMapping("/anonymous/listAll")
	public ResponseEntity<List<NewsVO>> listAll() {
		return new ResponseEntity<>(newsService.getAll(), HttpStatus.OK);
	}
}
