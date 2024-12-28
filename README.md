# mustache를 이용한 Todo List page

### 기술 스택(Tech Stack)
- Spring boot : 3.4.1 (SNAPSHOT)
- mybatis : 3.0.4
- mustache
- lombok

### mariaDB 준비
```
CREATE TABLE tbl_todo (
    id BIGINT NOT NULL AUTO_INCREMENT,   -- 자동 증가 및 NOT NULL
    task VARCHAR(255) NOT NULL,          -- 할 일 내용
    done BOOLEAN DEFAULT FALSE,          -- 완료 여부 (기본값: false)
    create_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- 생성 일자 (자동 입력)
    update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- 업데이트 일자 (자동 갱신)
    PRIMARY KEY (id)                     -- id를 기본 키로 설정
);
```
### Screen Shot
![todo home](https://github.com/user-attachments/assets/9d07ce4b-0314-4986-88e1-cb79751e0b20)

![todo list](https://github.com/user-attachments/assets/f5dcca57-888e-4e1f-86da-87123e43b524)
