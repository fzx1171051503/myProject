package demo.domain.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "address")
public class Address {

    /**
     * 主键
     */
    @Id
    private Integer id;
    /**
     * 省
     */
    @Column(name = "province", nullable = false)
    private String province;
    /**
     * 市
     */
    @Column(name = "city", nullable = false)
    private String city;
    /**
     * address
     */
    @Column(name = "address", nullable = false)
    private String address;
    /**
     * 创建时间
     */
    @Column(name = "create_time", nullable = false)
    private Date createTime;
    /**
     * 创建时间
     */
    @Column(name = "update_time", nullable = false)
    private Date updateTime;
    /**
     * contact
     */
    @Column(name = "contact", nullable = false)
    private String contact;
    /**
     * appellation
     */
    @Column(name = "appellation", nullable = false)
    private String appellation;
    /**
     * deleted
     */
    @Column(name = "deleted", nullable = false)
    private Boolean deleted;
    /**
     * deleted
     */
    @Column(name = "mobile", nullable = false)
    private String mobile;
    /**
     * status
     */
    @Column(name = "status", nullable = false)
    private Integer status;
    /**
     * user_id
     */
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    /**
     * province_id
     */
    @Column(name = "province_id", nullable = false)
    private Integer provinceId;
    /**
     * city_id
     */
    @Column(name = "city_id", nullable = false)
    private Integer cityId;
    /**
     * area_id
     */
    @Column(name = "area_id", nullable = false)
    private Integer areaId;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", contact='" + contact + '\'' +
                ", appellation='" + appellation + '\'' +
                ", deleted=" + deleted +
                ", mobile='" + mobile + '\'' +
                ", status=" + status +
                ", userId=" + userId +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", areaId=" + areaId +
                '}';
    }
}