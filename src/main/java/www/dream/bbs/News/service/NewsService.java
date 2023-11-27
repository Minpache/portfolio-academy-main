package www.dream.bbs.News.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.dream.bbs.News.model.NewsVO;
import www.dream.bbs.News.respository.NewsRepository;

@Service
public class NewsService {
	@Autowired
	private NewsRepository newsRepository;

	public List<NewsVO> getAll() {
		List<NewsVO> dsgvs = newsRepository.listAll();
		return dsgvs;
	}
}