package com.boob.sw.model;

import java.util.Date;

public class GoodsComment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_comment.id
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_comment.u_id
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    private Long uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_comment.g_id
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    private Long gId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_comment.score
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_comment.comment
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_comment.after_comment
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    private String afterComment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_comment.gmt_created
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    private Date gmtCreated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_comment.gmt_modified
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_comment.id
     *
     * @return the value of goods_comment.id
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_comment.id
     *
     * @param id the value for goods_comment.id
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_comment.u_id
     *
     * @return the value of goods_comment.u_id
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public Long getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_comment.u_id
     *
     * @param uId the value for goods_comment.u_id
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public void setuId(Long uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_comment.g_id
     *
     * @return the value of goods_comment.g_id
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public Long getgId() {
        return gId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_comment.g_id
     *
     * @param gId the value for goods_comment.g_id
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public void setgId(Long gId) {
        this.gId = gId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_comment.score
     *
     * @return the value of goods_comment.score
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_comment.score
     *
     * @param score the value for goods_comment.score
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_comment.comment
     *
     * @return the value of goods_comment.comment
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_comment.comment
     *
     * @param comment the value for goods_comment.comment
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_comment.after_comment
     *
     * @return the value of goods_comment.after_comment
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public String getAfterComment() {
        return afterComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_comment.after_comment
     *
     * @param afterComment the value for goods_comment.after_comment
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public void setAfterComment(String afterComment) {
        this.afterComment = afterComment == null ? null : afterComment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_comment.gmt_created
     *
     * @return the value of goods_comment.gmt_created
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_comment.gmt_created
     *
     * @param gmtCreated the value for goods_comment.gmt_created
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_comment.gmt_modified
     *
     * @return the value of goods_comment.gmt_modified
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_comment.gmt_modified
     *
     * @param gmtModified the value for goods_comment.gmt_modified
     *
     * @mbg.generated Tue Jan 21 13:29:56 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}