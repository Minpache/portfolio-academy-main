package www.dream.bbs.News.model;



import com.fasterxml.jackson.annotation.JsonAutoDetect;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name="news_crawling")
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class NewsVO {
	@Id
	private String newsdate; // 뉴스 게시 날짜
	private String newstitle; // 뉴스 헤드라인
	private int id;

	// shelterVO에 대한 생성자
	public NewsVO(String newsdate, String newstitle, int id) {
		this.newsdate = newsdate;
		this.newstitle = newstitle;
		this.id = id;
	}
}
