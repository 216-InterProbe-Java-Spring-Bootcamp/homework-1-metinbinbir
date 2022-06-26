package com.metinbinbir.interprobehw1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "PRODUCT_COMMENT")
public class ProductComment {

    @Id
    @GeneratedValue(generator = "ProductComment")
    @SequenceGenerator(name = "ProductComment", sequenceName = "PRODUCT_COMMENT_ID_SEQ")
    private Long id;

    @Column(name = "COMMENT", length = 500, nullable = false)
    private String comment;

    @Column(name = "COMMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date commentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PRODUCT", nullable = false, foreignKey = @ForeignKey(name = "FK_PRODUCT_COMMENT_PRODUCT"))
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER", nullable = false, foreignKey = @ForeignKey(name = "FK_PRODUCT_COMMENT_USER"))
    private User user;

}
