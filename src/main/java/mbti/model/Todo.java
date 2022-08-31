package mbti.model;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Todo {
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 50)
	private String todo;
	@Column(name="create_date")
	@CreationTimestamp
	private LocalDateTime createDate;
	@Column(name="end_date")
	private LocalDateTime endDate;
	@ManyToOne // member 1개에 Todo가 여러개 들어올 수 있다.
	@JoinColumn(name="member_id")
	private Member member;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		// 여기 변수 안에다가 member대신에 name 넣어줘야하나 ??
		this.member = member;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", todo=" + todo + ", createDate=" + createDate + ", endDate=" + endDate + ", member="
				+ member + "]";
	}
	
	
}