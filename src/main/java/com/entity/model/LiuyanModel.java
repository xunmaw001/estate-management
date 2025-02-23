package com.entity.model;

import com.entity.LiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 留言
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-29
 */
public class LiuyanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 留言名称
     */
    private String liuyanName;


    /**
     * 留言类型
     */
    private Integer liuyanTypes;


    /**
     * 留言时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 留言详情
     */
    private String liuyanContent;


    /**
     * 回复
     */
    private String replyContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：留言名称
	 */
    public String getLiuyanName() {
        return liuyanName;
    }


    /**
	 * 设置：留言名称
	 */
    public void setLiuyanName(String liuyanName) {
        this.liuyanName = liuyanName;
    }
    /**
	 * 获取：留言类型
	 */
    public Integer getLiuyanTypes() {
        return liuyanTypes;
    }


    /**
	 * 设置：留言类型
	 */
    public void setLiuyanTypes(Integer liuyanTypes) {
        this.liuyanTypes = liuyanTypes;
    }
    /**
	 * 获取：留言时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：留言时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：留言详情
	 */
    public String getLiuyanContent() {
        return liuyanContent;
    }


    /**
	 * 设置：留言详情
	 */
    public void setLiuyanContent(String liuyanContent) {
        this.liuyanContent = liuyanContent;
    }
    /**
	 * 获取：回复
	 */
    public String getReplyContent() {
        return replyContent;
    }


    /**
	 * 设置：回复
	 */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
