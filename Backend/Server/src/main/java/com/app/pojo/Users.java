package com.app.pojo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name="Users",uniqueConstraints= @UniqueConstraint(columnNames ="email" ))
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name="fname",length=20)
	private String fname;
	
	@Column(name="lname",length=20)
	private String lname;
	
	@Column(name="role",length=20)
	private String role;
	
	@Column(name="email",length=20)
    private String email;
	
	@Column(name="password",length=20)
	private String password;
	
	@Column(name="created_at")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name="modified_at")
	@UpdateTimestamp
	private LocalDateTime modifiedAt;
	
	@ManyToOne
	@JoinColumn(name="outlet_id")
	private Outlet outlet;
	
	
}