package importXlsm.vo;
/**
 * 异地推介补充要素 (BIONE_PREREGIST_FACTOR)
 * 
 * @author HFH
 * @version 1.0.0 2019-05-10
 */
public class BionePreregistFactorVO{

	
	private String id;
	
    /** 项目主键id */
    private String proId;

    /** 是否全国推介  */
    private String sfqgtj;

    /** 推介地  */
    private String tjd;

    /** 推介地-省  */
    private String tjdP;

    /** 推介地-城市  */
    private String tjdC;

    /** 推介地-地址  */
    private String tjdA;

    /** 推介机构  */
    private String tjjg;

    /** 推介费率  */
    private String tjfl;

    /** 推介期  */
    private String tjq;

    /** 计划推介规模（万 元）  */
    private String jhtjgm;

    /** 推介方式和推介管 理
当 */
    private String tjfshtjgl;

    /** 推介负责人名称  */
    private String tjfzrmc;

    /** 推介负责人电话  */
    private String tjfzrdh;

    
    private Integer flag;
    
    
    public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	/**
     * 获取项目主键id
     * 
     * @return 项目主键id
     */
    public String getProId() {
        return this.proId;
    }

    /**
     * 设置项目主键id
     * 
     * @param proId
     *          项目主键id
     */
    public void setProId(String proId) {
        this.proId = proId;
    }

    /**
     * 获取是否全国推介 
     * 
     * @return 是否全国推介 
     */
    public String getSfqgtj() {
        return this.sfqgtj;
    }

    /**
     * 设置是否全国推介 
     * 
     * @param sfqgtj
     *          是否全国推介 
     */
    public void setSfqgtj(String sfqgtj) {
        this.sfqgtj = sfqgtj;
    }

    /**
     * 获取推介地 
     * 
     * @return 推介地 
     */
    public String getTjd() {
        return this.tjd;
    }

    /**
     * 设置推介地 
     * 
     * @param tjd
     *          推介地 
     */
    public void setTjd(String tjd) {
        this.tjd = tjd;
    }

    /**
     * 获取推介地-省 
     * 
     * @return 推介地-省 
     */
    public String getTjdP() {
        return this.tjdP;
    }

    /**
     * 设置推介地-省 
     * 
     * @param tjdP
     *          推介地-省 
     */
    public void setTjdP(String tjdP) {
        this.tjdP = tjdP;
    }

    /**
     * 获取推介地-城市 
     * 
     * @return 推介地-城市 
     */
    public String getTjdC() {
        return this.tjdC;
    }

    /**
     * 设置推介地-城市 
     * 
     * @param tjdC
     *          推介地-城市 
     */
    public void setTjdC(String tjdC) {
        this.tjdC = tjdC;
    }

    /**
     * 获取推介地-地址 
     * 
     * @return 推介地-地址 
     */
    public String getTjdA() {
        return this.tjdA;
    }

    /**
     * 设置推介地-地址 
     * 
     * @param tjdA
     *          推介地-地址 
     */
    public void setTjdA(String tjdA) {
        this.tjdA = tjdA;
    }

    /**
     * 获取推介机构 
     * 
     * @return 推介机构 
     */
    public String getTjjg() {
        return this.tjjg;
    }

    /**
     * 设置推介机构 
     * 
     * @param tjjg
     *          推介机构 
     */
    public void setTjjg(String tjjg) {
        this.tjjg = tjjg;
    }

    /**
     * 获取推介费率 
     * 
     * @return 推介费率 
     */
    public String getTjfl() {
        return this.tjfl;
    }

    /**
     * 设置推介费率 
     * 
     * @param tjfl
     *          推介费率 
     */
    public void setTjfl(String tjfl) {
        this.tjfl = tjfl;
    }

    /**
     * 获取推介期 
     * 
     * @return 推介期 
     */
    public String getTjq() {
        return this.tjq;
    }

    /**
     * 设置推介期 
     * 
     * @param tjq
     *          推介期 
     */
    public void setTjq(String tjq) {
        this.tjq = tjq;
    }

    /**
     * 获取计划推介规模（万 元） 
     * 
     * @return 计划推介规模（万 元） 
     */
    public String getJhtjgm() {
        return this.jhtjgm;
    }

    /**
     * 设置计划推介规模（万 元） 
     * 
     * @param jhtjgm
     *          计划推介规模（万 元） 
     */
    public void setJhtjgm(String jhtjgm) {
        this.jhtjgm = jhtjgm;
    }

    /**
     * 获取推介方式和推介管 理
当
     * 
     * @return 推介方式和推介管 理
当
     */
    public String getTjfshtjgl() {
        return this.tjfshtjgl;
    }

    /**
     * 设置推介方式和推介管 理
当
     * 
     * @param tjfshtjgl
     *          推介方式和推介管 理
当
     */
    public void setTjfshtjgl(String tjfshtjgl) {
        this.tjfshtjgl = tjfshtjgl;
    }

    /**
     * 获取推介负责人名称 
     * 
     * @return 推介负责人名称 
     */
    public String getTjfzrmc() {
        return this.tjfzrmc;
    }

    /**
     * 设置推介负责人名称 
     * 
     * @param tjfzrmc
     *          推介负责人名称 
     */
    public void setTjfzrmc(String tjfzrmc) {
        this.tjfzrmc = tjfzrmc;
    }

    /**
     * 获取推介负责人电话 
     * 
     * @return 推介负责人电话 
     */
    public String getTjfzrdh() {
        return this.tjfzrdh;
    }

    /**
     * 设置推介负责人电话 
     * 
     * @param tjfzrdh
     *          推介负责人电话 
     */
    public void setTjfzrdh(String tjfzrdh) {
        this.tjfzrdh = tjfzrdh;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    
}