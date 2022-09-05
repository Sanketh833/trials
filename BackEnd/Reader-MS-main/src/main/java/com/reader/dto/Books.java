package com.reader.dto;



public class Books {
			private Integer id;
			private String title;
			private String category;
			private String image;
			private Long price;
			private String publisher;
			private Boolean active;
			private String content;
			private String authorName;
			private Integer aId;
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public String getCategory() {
				return category;
			}
			public void setCategory(String category) {
				this.category = category;
			}
			public String getImage() {
				return image;
			}
			public void setImage(String image) {
				this.image = image;
			}
			public Long getPrice() {
				return price;
			}
			public void setPrice(Long price) {
				this.price = price;
			}
			public String getPublisher() {
				return publisher;
			}
			public void setPublisher(String publisher) {
				this.publisher = publisher;
			}
			public Boolean getActive() {
				return active;
			}
			public void setActive(Boolean active) {
				this.active = active;
			}
			public String getContent() {
				return content;
			}
			public void setContent(String content) {
				this.content = content;
			}
			public String getAuthorName() {
				return authorName;
			}
			public void setAuthorName(String authorName) {
				this.authorName = authorName;
			}
			public Integer getaId() {
				return aId;
			}
			public void setaId(Integer aId) {
				this.aId = aId;
			}
			public Books(Integer id, String title, String category, String image, Long price, String publisher,
					Boolean active, String content, String authorName, Integer aId) {
				super();
				this.id = id;
				this.title = title;
				this.category = category;
				this.image = image;
				this.price = price;
				this.publisher = publisher;
				this.active = active;
				this.content = content;
				this.authorName = authorName;
				this.aId = aId;
			}
			public Books() {
				super();
			}
			
}
