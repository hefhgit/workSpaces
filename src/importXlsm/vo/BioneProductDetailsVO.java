package importXlsm.vo;

import java.util.ArrayList;
import java.util.Map;

/**
 * 预登记产品信息详情表(BIONE_PRODUCT_DETAILS)
 * 
 * @author HFH
 * @version 1.0.0 2019-05-10
 */
public class BioneProductDetailsVO extends BionePreregistFactorVO implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 5346057209088359963L;

    /** 信托机构名称 */
    private String xtjgmc;

    /** 注册地址 */
    private String zcdz;

    /** 上月末净资产(万 元) */
    private String symjzc;

    /** 上季末净资本(万 元) */
    private String sjmjzc;

    /** 上月末信托总资产 (万元) */
    private String symxtzzc;

    /** ydjlx */
    private String ydjlx;

    /** 上季末风险资本 (万元) */
    private String sjmfxzb;

    /** 信托财产性质标识 */
    private String csxtcclx;

    /** 财产权信托进行受益权拆分转让或者对外发行受益权标识 */
    private String ccqxtcfzr;

    /** 单一集合标识 */
    private String dyjhbz;

    /** 信托功能标识 */
    private String xtgn;

    /** 报告业务类型 */
    private String bgywlx;

    /** 其他报告业务类型 */
    private String qtbgywlx;

    /** 是否为新发分期 */
    private String sfwxffq;

    /** 信托产品名称 */
    private String xtxmmc;

    /** 拟发行或成立总规模类型 */
    private String nfxclzgmlx;

    /** 固定期限总范围 (月) (下限)*/
    private String zdgdqxzfw;

    /** 固定规模总范围 (万元)  (下限)*/
    private String zdgdgmzfw;

    /** 信托产品总期限类型 */
    private String xtxmzqxlx;

    /** 拟发行或成立规模类型 */
    private String yjxtxmgm;

    /** 固定规模范围（万 元）（下限） */
    private String zdxtxmgmfw;

    /** 信托产品期限类型 */
    private String xtxmqxlx;

    /** 固定期限范围(月) （下限）  */
    private String zdxtxmqxfw;

    /** 分期累计发行(成立)规模(万元) */
    private String fqljfxgm;

    /** 拟发行或成立时间 */
    private String nfxhclsj;

    /** 委托人及财产来源 */
    private String wtrjzjly;

    /** 适宜投资人群 */
    private String sytzrq;

    /** 保管标识 */
    private String bgbs;

    /** 保管方信息 */
    private String xtzjbgyh;

    /** 信托报酬率 */
    private String xtbcl;

    /** 信托合同收益率类型 */
    private String syrsyllx;

    /** 信托合同约定基准
收益率范围（下限）
  */
    private String syryqsylqjZg;

    /** 项目来源 */
    private String xmly;

    /** 项目推荐机构 */
    private String xmtjjg;

    /** 信托财产管理方式 */
    private String xmglfs;

    /** 交易对手名称 */
    private String jydsmc;

    /** 交易对手信息 */
    private String jydsxx;

    /** 信托财产投向和运用方式 */
    private String xtcctxhyyfs;

    /** 采取风控措施及风险提示信息 */
    private String fxkzcs;

    /** 预计还款来源/信托退出方式 */
    private String yjhklyjtcfs;

    /** 公司合法合规意见 */
    private String gshfhgyj;

    /** 信托经理姓名 */
    private String xtjlxm;

    /** 信托经理电话
 */
    private String xtjldh;

    /** 分管高级管理人员姓名 */
    private String fggjglry;

    /** 关联交易类型 */
    private String gljylx;

    /** 关联交易补充说明 */
    private String qtgljylx;

    /** 关联方情况与关联关系 */
    private String glfqkyglgx;

    /** 关联交易目的 */
    private String gljymd;

    /** 关联交易定价 */
    private String gljydj;

    /** 市场同类业务定价情况 */
    private String sctlywdjqk;

    /** 项目类型 */
    private String xmlx;

    /** 业务类型 */
    private String ywlx;

    /** 项目所在地 */
    private String xmszd;

    /** 是否四证齐全 */
    private String sfszqq;

    /** 现有证照编号 */
    private String xyzjbh;

    /** 资本金比例情况 */
    private String zbjblqk;

    /** 开发商或其控股股东资质情况 */
    private String kfshqkggdzzqk;

    /** 其他说明 */
    private String qtsm;

    /** 资金来源 */
    private String zjly;

    /** 是否结构化信托 */
    private String sfjghxt;

    /** 优先劣后比例 */
    private String yxlhbl;

    /** 投资范围 */
    private String tzfw;

    /** 投资顾问情况 */
    private String tzgwqk;

    /** 投资顾问是否信托公司关联方 */
    private String tgsfglf;

    /** 项目主键id */
    private String proId;

    /** 固定规模范围（万 元）（上限）  */
    private String zgxtxmgmfw;

    /** 固定期限范围（月） （上限）  */
    private String zgxtxmqxfw;

    /** 固定规模总范围 （万元）（上限）  */
    private String zggdgmzfw;

    /** 固定期限总范围 （月）（上限）  */
    private String zggdqxzfw;

    /** 信托合同约定基准
收益率范围（上限）
  */
    private String syryqsylqjZd;

    /** 交易结构 */
    private String jyjg;

    /** 风险预案说明 */
    private String fxyasm;
    
    /** 0新增 1修改*/
    private Integer flag;
    
    private Object preregist_factor_romotion;
    
 



	
	public Object getPreregist_factor_romotion() {
		return preregist_factor_romotion;
	}

	public void setPreregist_factor_romotion(Object preregist_factor_romotion) {
		this.preregist_factor_romotion = preregist_factor_romotion;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	/**
     * 获取信托机构名称
     * 
     * @return 信托机构名称
     */
    public String getXtjgmc() {
        return this.xtjgmc;
    }

    /**
     * 设置信托机构名称
     * 
     * @param xtjgmc
     *          信托机构名称
     */
    public void setXtjgmc(String xtjgmc) {
        this.xtjgmc = xtjgmc;
    }

    /**
     * 获取注册地址
     * 
     * @return 注册地址
     */
    public String getZcdz() {
        return this.zcdz;
    }

    /**
     * 设置注册地址
     * 
     * @param zcdz
     *          注册地址
     */
    public void setZcdz(String zcdz) {
        this.zcdz = zcdz;
    }

    /**
     * 获取上月末净资产(万 元)
     * 
     * @return 上月末净资产(万 元)
     */
    public String getSymjzc() {
        return this.symjzc;
    }

    /**
     * 设置上月末净资产(万 元)
     * 
     * @param symjzc
     *          上月末净资产(万 元)
     */
    public void setSymjzc(String symjzc) {
        this.symjzc = symjzc;
    }

    /**
     * 获取上季末净资本(万 元)
     * 
     * @return 上季末净资本(万 元)
     */
    public String getSjmjzc() {
        return this.sjmjzc;
    }

    /**
     * 设置上季末净资本(万 元)
     * 
     * @param sjmjzc
     *          上季末净资本(万 元)
     */
    public void setSjmjzc(String sjmjzc) {
        this.sjmjzc = sjmjzc;
    }

    /**
     * 获取上月末信托总资产 (万元)
     * 
     * @return 上月末信托总资产 (万元)
     */
    public String getSymxtzzc() {
        return this.symxtzzc;
    }

    /**
     * 设置上月末信托总资产 (万元)
     * 
     * @param symxtzzc
     *          上月末信托总资产 (万元)
     */
    public void setSymxtzzc(String symxtzzc) {
        this.symxtzzc = symxtzzc;
    }

    /**
     * 获取ydjlx
     * 
     * @return ydjlx
     */
    public String getYdjlx() {
        return this.ydjlx;
    }

    /**
     * 设置ydjlx
     * 
     * @param ydjlx
     */
    public void setYdjlx(String ydjlx) {
        this.ydjlx = ydjlx;
    }

    /**
     * 获取上季末风险资本 (万元)
     * 
     * @return 上季末风险资本 (万元)
     */
    public String getSjmfxzb() {
        return this.sjmfxzb;
    }

    /**
     * 设置上季末风险资本 (万元)
     * 
     * @param sjmfxzb
     *          上季末风险资本 (万元)
     */
    public void setSjmfxzb(String sjmfxzb) {
        this.sjmfxzb = sjmfxzb;
    }

    /**
     * 获取信托财产性质标识
     * 
     * @return 信托财产性质标识
     */
    public String getCsxtcclx() {
        return this.csxtcclx;
    }

    /**
     * 设置信托财产性质标识
     * 
     * @param csxtcclx
     *          信托财产性质标识
     */
    public void setCsxtcclx(String csxtcclx) {
        this.csxtcclx = csxtcclx;
    }

    /**
     * 获取财产权信托进行受益权拆分转让或者对外发行受益权标识
     * 
     * @return 财产权信托进行受益权拆分转让或者对外发行受益权标识
     */
    public String getCcqxtcfzr() {
        return this.ccqxtcfzr;
    }

    /**
     * 设置财产权信托进行受益权拆分转让或者对外发行受益权标识
     * 
     * @param ccqxtcfzr
     *          财产权信托进行受益权拆分转让或者对外发行受益权标识
     */
    public void setCcqxtcfzr(String ccqxtcfzr) {
        this.ccqxtcfzr = ccqxtcfzr;
    }

    /**
     * 获取单一集合标识
     * 
     * @return 单一集合标识
     */
    public String getDyjhbz() {
        return this.dyjhbz;
    }

    /**
     * 设置单一集合标识
     * 
     * @param dyjhbz
     *          单一集合标识
     */
    public void setDyjhbz(String dyjhbz) {
        this.dyjhbz = dyjhbz;
    }

    /**
     * 获取信托功能标识
     * 
     * @return 信托功能标识
     */
    public String getXtgn() {
        return this.xtgn;
    }

    /**
     * 设置信托功能标识
     * 
     * @param xtgn
     *          信托功能标识
     */
    public void setXtgn(String xtgn) {
        this.xtgn = xtgn;
    }

    /**
     * 获取报告业务类型
     * 
     * @return 报告业务类型
     */
    public String getBgywlx() {
        return this.bgywlx;
    }

    /**
     * 设置报告业务类型
     * 
     * @param bgywlx
     *          报告业务类型
     */
    public void setBgywlx(String bgywlx) {
        this.bgywlx = bgywlx;
    }

    /**
     * 获取其他报告业务类型
     * 
     * @return 其他报告业务类型
     */
    public String getQtbgywlx() {
        return this.qtbgywlx;
    }

    /**
     * 设置其他报告业务类型
     * 
     * @param qtbgywlx
     *          其他报告业务类型
     */
    public void setQtbgywlx(String qtbgywlx) {
        this.qtbgywlx = qtbgywlx;
    }

    /**
     * 获取是否为新发分期
     * 
     * @return 是否为新发分期
     */
    public String getSfwxffq() {
        return this.sfwxffq;
    }

    /**
     * 设置是否为新发分期
     * 
     * @param sfwxffq
     *          是否为新发分期
     */
    public void setSfwxffq(String sfwxffq) {
        this.sfwxffq = sfwxffq;
    }

    /**
     * 获取信托产品名称
     * 
     * @return 信托产品名称
     */
    public String getXtxmmc() {
        return this.xtxmmc;
    }

    /**
     * 设置信托产品名称
     * 
     * @param xtxmmc
     *          信托产品名称
     */
    public void setXtxmmc(String xtxmmc) {
        this.xtxmmc = xtxmmc;
    }

    /**
     * 获取拟发行或成立总规模类型
     * 
     * @return 拟发行或成立总规模类型
     */
    public String getNfxclzgmlx() {
        return this.nfxclzgmlx;
    }

    /**
     * 设置拟发行或成立总规模类型
     * 
     * @param nfxclzgmlx
     *          拟发行或成立总规模类型
     */
    public void setNfxclzgmlx(String nfxclzgmlx) {
        this.nfxclzgmlx = nfxclzgmlx;
    }

    /**
     * 获取固定期限总范围 (月)
     * 
     * @return 固定期限总范围 (月)
     */
    public String getZdgdqxzfw() {
        return this.zdgdqxzfw;
    }

    /**
     * 设置固定期限总范围 (月)
     * 
     * @param zdgdqxzfw
     *          固定期限总范围 (月)
     */
    public void setZdgdqxzfw(String zdgdqxzfw) {
        this.zdgdqxzfw = zdgdqxzfw;
    }

    /**
     * 获取固定规模总范围 (万元)
     * 
     * @return 固定规模总范围 (万元)
     */
    public String getZdgdgmzfw() {
        return this.zdgdgmzfw;
    }

    /**
     * 设置固定规模总范围 (万元)
     * 
     * @param zdgdgmzfw
     *          固定规模总范围 (万元)
     */
    public void setZdgdgmzfw(String zdgdgmzfw) {
        this.zdgdgmzfw = zdgdgmzfw;
    }

    /**
     * 获取信托产品总期限类型
     * 
     * @return 信托产品总期限类型
     */
    public String getXtxmzqxlx() {
        return this.xtxmzqxlx;
    }

    /**
     * 设置信托产品总期限类型
     * 
     * @param xtxmzqxlx
     *          信托产品总期限类型
     */
    public void setXtxmzqxlx(String xtxmzqxlx) {
        this.xtxmzqxlx = xtxmzqxlx;
    }

    /**
     * 获取拟发行或成立规模类型
     * 
     * @return 拟发行或成立规模类型
     */
    public String getYjxtxmgm() {
        return this.yjxtxmgm;
    }

    /**
     * 设置拟发行或成立规模类型
     * 
     * @param yjxtxmgm
     *          拟发行或成立规模类型
     */
    public void setYjxtxmgm(String yjxtxmgm) {
        this.yjxtxmgm = yjxtxmgm;
    }

    /**
     * 获取固定规模范围（万 元）（上限）
     * 
     * @return 固定规模范围（万 元）（上限）
     */
    public String getZdxtxmgmfw() {
        return this.zdxtxmgmfw;
    }

    /**
     * 设置固定规模范围（万 元）（上限）
     * 
     * @param zdxtxmgmfw
     *          固定规模范围（万 元）（上限）
     */
    public void setZdxtxmgmfw(String zdxtxmgmfw) {
        this.zdxtxmgmfw = zdxtxmgmfw;
    }

    /**
     * 获取信托产品期限类型
     * 
     * @return 信托产品期限类型
     */
    public String getXtxmqxlx() {
        return this.xtxmqxlx;
    }

    /**
     * 设置信托产品期限类型
     * 
     * @param xtxmqxlx
     *          信托产品期限类型
     */
    public void setXtxmqxlx(String xtxmqxlx) {
        this.xtxmqxlx = xtxmqxlx;
    }

    /**
     * 获取固定期限范围(月) （下限） 
     * 
     * @return 固定期限范围(月) （下限） 
     */
    public String getZdxtxmqxfw() {
        return this.zdxtxmqxfw;
    }

    /**
     * 设置固定期限范围(月) （下限） 
     * 
     * @param zdxtxmqxfw
     *          固定期限范围(月) （下限） 
     */
    public void setZdxtxmqxfw(String zdxtxmqxfw) {
        this.zdxtxmqxfw = zdxtxmqxfw;
    }

    /**
     * 获取分期累计发行(成立)规模(万元)
     * 
     * @return 分期累计发行(成立)规模(万元)
     */
    public String getFqljfxgm() {
        return this.fqljfxgm;
    }

    /**
     * 设置分期累计发行(成立)规模(万元)
     * 
     * @param fqljfxgm
     *          分期累计发行(成立)规模(万元)
     */
    public void setFqljfxgm(String fqljfxgm) {
        this.fqljfxgm = fqljfxgm;
    }

    /**
     * 获取拟发行或成立时间
     * 
     * @return 拟发行或成立时间
     */
    public String getNfxhclsj() {
        return this.nfxhclsj;
    }

    /**
     * 设置拟发行或成立时间
     * 
     * @param nfxhclsj
     *          拟发行或成立时间
     */
    public void setNfxhclsj(String nfxhclsj) {
        this.nfxhclsj = nfxhclsj;
    }

    /**
     * 获取委托人及财产来源
     * 
     * @return 委托人及财产来源
     */
    public String getWtrjzjly() {
        return this.wtrjzjly;
    }

    /**
     * 设置委托人及财产来源
     * 
     * @param wtrjzjly
     *          委托人及财产来源
     */
    public void setWtrjzjly(String wtrjzjly) {
        this.wtrjzjly = wtrjzjly;
    }

    /**
     * 获取适宜投资人群
     * 
     * @return 适宜投资人群
     */
    public String getSytzrq() {
        return this.sytzrq;
    }

    /**
     * 设置适宜投资人群
     * 
     * @param sytzrq
     *          适宜投资人群
     */
    public void setSytzrq(String sytzrq) {
        this.sytzrq = sytzrq;
    }

    /**
     * 获取保管标识
     * 
     * @return 保管标识
     */
    public String getBgbs() {
        return this.bgbs;
    }

    /**
     * 设置保管标识
     * 
     * @param bgbs
     *          保管标识
     */
    public void setBgbs(String bgbs) {
        this.bgbs = bgbs;
    }

    /**
     * 获取保管方信息
     * 
     * @return 保管方信息
     */
    public String getXtzjbgyh() {
        return this.xtzjbgyh;
    }

    /**
     * 设置保管方信息
     * 
     * @param xtzjbgyh
     *          保管方信息
     */
    public void setXtzjbgyh(String xtzjbgyh) {
        this.xtzjbgyh = xtzjbgyh;
    }

    /**
     * 获取信托报酬率
     * 
     * @return 信托报酬率
     */
    public String getXtbcl() {
        return this.xtbcl;
    }

    /**
     * 设置信托报酬率
     * 
     * @param xtbcl
     *          信托报酬率
     */
    public void setXtbcl(String xtbcl) {
        this.xtbcl = xtbcl;
    }

    /**
     * 获取信托合同收益率类型
     * 
     * @return 信托合同收益率类型
     */
    public String getSyrsyllx() {
        return this.syrsyllx;
    }

    /**
     * 设置信托合同收益率类型
     * 
     * @param syrsyllx
     *          信托合同收益率类型
     */
    public void setSyrsyllx(String syrsyllx) {
        this.syrsyllx = syrsyllx;
    }

    /**
     * 获取信托合同约定基准
收益率范围（下限）
 
     * 
     * @return 信托合同约定基准
收益率范围（下限）
 
     */
    public String getSyryqsylqjZg() {
        return this.syryqsylqjZg;
    }

    /**
     * 设置信托合同约定基准
收益率范围（下限）
 
     * 
     * @param syryqsylqjZg
     *          信托合同约定基准
收益率范围（下限）
 
     */
    public void setSyryqsylqjZg(String syryqsylqjZg) {
        this.syryqsylqjZg = syryqsylqjZg;
    }

    /**
     * 获取项目来源
     * 
     * @return 项目来源
     */
    public String getXmly() {
        return this.xmly;
    }

    /**
     * 设置项目来源
     * 
     * @param xmly
     *          项目来源
     */
    public void setXmly(String xmly) {
        this.xmly = xmly;
    }

    /**
     * 获取项目推荐机构
     * 
     * @return 项目推荐机构
     */
    public String getXmtjjg() {
        return this.xmtjjg;
    }

    /**
     * 设置项目推荐机构
     * 
     * @param xmtjjg
     *          项目推荐机构
     */
    public void setXmtjjg(String xmtjjg) {
        this.xmtjjg = xmtjjg;
    }

    /**
     * 获取信托财产管理方式
     * 
     * @return 信托财产管理方式
     */
    public String getXmglfs() {
        return this.xmglfs;
    }

    /**
     * 设置信托财产管理方式
     * 
     * @param xmglfs
     *          信托财产管理方式
     */
    public void setXmglfs(String xmglfs) {
        this.xmglfs = xmglfs;
    }

    /**
     * 获取交易对手名称
     * 
     * @return 交易对手名称
     */
    public String getJydsmc() {
        return this.jydsmc;
    }

    /**
     * 设置交易对手名称
     * 
     * @param jydsmc
     *          交易对手名称
     */
    public void setJydsmc(String jydsmc) {
        this.jydsmc = jydsmc;
    }

    /**
     * 获取交易对手信息
     * 
     * @return 交易对手信息
     */
    public String getJydsxx() {
        return this.jydsxx;
    }

    /**
     * 设置交易对手信息
     * 
     * @param jydsxx
     *          交易对手信息
     */
    public void setJydsxx(String jydsxx) {
        this.jydsxx = jydsxx;
    }

    /**
     * 获取信托财产投向和运用方式
     * 
     * @return 信托财产投向和运用方式
     */
    public String getXtcctxhyyfs() {
        return this.xtcctxhyyfs;
    }

    /**
     * 设置信托财产投向和运用方式
     * 
     * @param xtcctxhyyfs
     *          信托财产投向和运用方式
     */
    public void setXtcctxhyyfs(String xtcctxhyyfs) {
        this.xtcctxhyyfs = xtcctxhyyfs;
    }

    /**
     * 获取采取风控措施及风险提示信息
     * 
     * @return 采取风控措施及风险提示信息
     */
    public String getFxkzcs() {
        return this.fxkzcs;
    }

    /**
     * 设置采取风控措施及风险提示信息
     * 
     * @param fxkzcs
     *          采取风控措施及风险提示信息
     */
    public void setFxkzcs(String fxkzcs) {
        this.fxkzcs = fxkzcs;
    }

    /**
     * 获取预计还款来源/信托退出方式
     * 
     * @return 预计还款来源/信托退出方式
     */
    public String getYjhklyjtcfs() {
        return this.yjhklyjtcfs;
    }

    /**
     * 设置预计还款来源/信托退出方式
     * 
     * @param yjhklyjtcfs
     *          预计还款来源/信托退出方式
     */
    public void setYjhklyjtcfs(String yjhklyjtcfs) {
        this.yjhklyjtcfs = yjhklyjtcfs;
    }

    /**
     * 获取公司合法合规意见
     * 
     * @return 公司合法合规意见
     */
    public String getGshfhgyj() {
        return this.gshfhgyj;
    }

    /**
     * 设置公司合法合规意见
     * 
     * @param gshfhgyj
     *          公司合法合规意见
     */
    public void setGshfhgyj(String gshfhgyj) {
        this.gshfhgyj = gshfhgyj;
    }

    /**
     * 获取信托经理姓名
     * 
     * @return 信托经理姓名
     */
    public String getXtjlxm() {
        return this.xtjlxm;
    }

    /**
     * 设置信托经理姓名
     * 
     * @param xtjlxm
     *          信托经理姓名
     */
    public void setXtjlxm(String xtjlxm) {
        this.xtjlxm = xtjlxm;
    }

    /**
     * 获取信托经理电话

     * 
     * @return 信托经理电话

     */
    public String getXtjldh() {
        return this.xtjldh;
    }

    /**
     * 设置信托经理电话

     * 
     * @param xtjldh
     *          信托经理电话

     */
    public void setXtjldh(String xtjldh) {
        this.xtjldh = xtjldh;
    }

    /**
     * 获取分管高级管理人员姓名
     * 
     * @return 分管高级管理人员姓名
     */
    public String getFggjglry() {
        return this.fggjglry;
    }

    /**
     * 设置分管高级管理人员姓名
     * 
     * @param fggjglry
     *          分管高级管理人员姓名
     */
    public void setFggjglry(String fggjglry) {
        this.fggjglry = fggjglry;
    }

    /**
     * 获取关联交易类型
     * 
     * @return 关联交易类型
     */
    public String getGljylx() {
        return this.gljylx;
    }

    /**
     * 设置关联交易类型
     * 
     * @param gljylx
     *          关联交易类型
     */
    public void setGljylx(String gljylx) {
        this.gljylx = gljylx;
    }

    /**
     * 获取关联交易补充说明
     * 
     * @return 关联交易补充说明
     */
    public String getQtgljylx() {
        return this.qtgljylx;
    }

    /**
     * 设置关联交易补充说明
     * 
     * @param qtgljylx
     *          关联交易补充说明
     */
    public void setQtgljylx(String qtgljylx) {
        this.qtgljylx = qtgljylx;
    }

    /**
     * 获取关联方情况与关联关系
     * 
     * @return 关联方情况与关联关系
     */
    public String getGlfqkyglgx() {
        return this.glfqkyglgx;
    }

    /**
     * 设置关联方情况与关联关系
     * 
     * @param glfqkyglgx
     *          关联方情况与关联关系
     */
    public void setGlfqkyglgx(String glfqkyglgx) {
        this.glfqkyglgx = glfqkyglgx;
    }

    /**
     * 获取关联交易目的
     * 
     * @return 关联交易目的
     */
    public String getGljymd() {
        return this.gljymd;
    }

    /**
     * 设置关联交易目的
     * 
     * @param gljymd
     *          关联交易目的
     */
    public void setGljymd(String gljymd) {
        this.gljymd = gljymd;
    }

    /**
     * 获取关联交易定价
     * 
     * @return 关联交易定价
     */
    public String getGljydj() {
        return this.gljydj;
    }

    /**
     * 设置关联交易定价
     * 
     * @param gljydj
     *          关联交易定价
     */
    public void setGljydj(String gljydj) {
        this.gljydj = gljydj;
    }

    /**
     * 获取市场同类业务定价情况
     * 
     * @return 市场同类业务定价情况
     */
    public String getSctlywdjqk() {
        return this.sctlywdjqk;
    }

    /**
     * 设置市场同类业务定价情况
     * 
     * @param sctlywdjqk
     *          市场同类业务定价情况
     */
    public void setSctlywdjqk(String sctlywdjqk) {
        this.sctlywdjqk = sctlywdjqk;
    }

    /**
     * 获取项目类型
     * 
     * @return 项目类型
     */
    public String getXmlx() {
        return this.xmlx;
    }

    /**
     * 设置项目类型
     * 
     * @param xmlx
     *          项目类型
     */
    public void setXmlx(String xmlx) {
        this.xmlx = xmlx;
    }

    /**
     * 获取业务类型
     * 
     * @return 业务类型
     */
    public String getYwlx() {
        return this.ywlx;
    }

    /**
     * 设置业务类型
     * 
     * @param ywlx
     *          业务类型
     */
    public void setYwlx(String ywlx) {
        this.ywlx = ywlx;
    }

    /**
     * 获取项目所在地
     * 
     * @return 项目所在地
     */
    public String getXmszd() {
        return this.xmszd;
    }

    /**
     * 设置项目所在地
     * 
     * @param xmszd
     *          项目所在地
     */
    public void setXmszd(String xmszd) {
        this.xmszd = xmszd;
    }

    /**
     * 获取是否四证齐全
     * 
     * @return 是否四证齐全
     */
    public String getSfszqq() {
        return this.sfszqq;
    }

    /**
     * 设置是否四证齐全
     * 
     * @param sfszqq
     *          是否四证齐全
     */
    public void setSfszqq(String sfszqq) {
        this.sfszqq = sfszqq;
    }

    /**
     * 获取现有证照编号
     * 
     * @return 现有证照编号
     */
    public String getXyzjbh() {
        return this.xyzjbh;
    }

    /**
     * 设置现有证照编号
     * 
     * @param xyzjbh
     *          现有证照编号
     */
    public void setXyzjbh(String xyzjbh) {
        this.xyzjbh = xyzjbh;
    }

    /**
     * 获取资本金比例情况
     * 
     * @return 资本金比例情况
     */
    public String getZbjblqk() {
        return this.zbjblqk;
    }

    /**
     * 设置资本金比例情况
     * 
     * @param zbjblqk
     *          资本金比例情况
     */
    public void setZbjblqk(String zbjblqk) {
        this.zbjblqk = zbjblqk;
    }

    /**
     * 获取开发商或其控股股东资质情况
     * 
     * @return 开发商或其控股股东资质情况
     */
    public String getKfshqkggdzzqk() {
        return this.kfshqkggdzzqk;
    }

    /**
     * 设置开发商或其控股股东资质情况
     * 
     * @param kfshqkggdzzqk
     *          开发商或其控股股东资质情况
     */
    public void setKfshqkggdzzqk(String kfshqkggdzzqk) {
        this.kfshqkggdzzqk = kfshqkggdzzqk;
    }

    /**
     * 获取其他说明
     * 
     * @return 其他说明
     */
    public String getQtsm() {
        return this.qtsm;
    }

    /**
     * 设置其他说明
     * 
     * @param qtsm
     *          其他说明
     */
    public void setQtsm(String qtsm) {
        this.qtsm = qtsm;
    }

    /**
     * 获取资金来源
     * 
     * @return 资金来源
     */
    public String getZjly() {
        return this.zjly;
    }

    /**
     * 设置资金来源
     * 
     * @param zjly
     *          资金来源
     */
    public void setZjly(String zjly) {
        this.zjly = zjly;
    }

    /**
     * 获取是否结构化信托
     * 
     * @return 是否结构化信托
     */
    public String getSfjghxt() {
        return this.sfjghxt;
    }

    /**
     * 设置是否结构化信托
     * 
     * @param sfjghxt
     *          是否结构化信托
     */
    public void setSfjghxt(String sfjghxt) {
        this.sfjghxt = sfjghxt;
    }

    /**
     * 获取优先劣后比例
     * 
     * @return 优先劣后比例
     */
    public String getYxlhbl() {
        return this.yxlhbl;
    }

    /**
     * 设置优先劣后比例
     * 
     * @param yxlhbl
     *          优先劣后比例
     */
    public void setYxlhbl(String yxlhbl) {
        this.yxlhbl = yxlhbl;
    }

    /**
     * 获取投资范围
     * 
     * @return 投资范围
     */
    public String getTzfw() {
        return this.tzfw;
    }

    /**
     * 设置投资范围
     * 
     * @param tzfw
     *          投资范围
     */
    public void setTzfw(String tzfw) {
        this.tzfw = tzfw;
    }

    /**
     * 获取投资顾问情况
     * 
     * @return 投资顾问情况
     */
    public String getTzgwqk() {
        return this.tzgwqk;
    }

    /**
     * 设置投资顾问情况
     * 
     * @param tzgwqk
     *          投资顾问情况
     */
    public void setTzgwqk(String tzgwqk) {
        this.tzgwqk = tzgwqk;
    }

    /**
     * 获取投资顾问是否信托公司关联方
     * 
     * @return 投资顾问是否信托公司关联方
     */
    public String getTgsfglf() {
        return this.tgsfglf;
    }

    /**
     * 设置投资顾问是否信托公司关联方
     * 
     * @param tgsfglf
     *          投资顾问是否信托公司关联方
     */
    public void setTgsfglf(String tgsfglf) {
        this.tgsfglf = tgsfglf;
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
     * 获取固定规模范围（万 元）（上限） 
     * 
     * @return 固定规模范围（万 元）（上限） 
     */
    public String getZgxtxmgmfw() {
        return this.zgxtxmgmfw;
    }

    /**
     * 设置固定规模范围（万 元）（上限） 
     * 
     * @param zgxtxmgmfw
     *          固定规模范围（万 元）（上限） 
     */
    public void setZgxtxmgmfw(String zgxtxmgmfw) {
        this.zgxtxmgmfw = zgxtxmgmfw;
    }

    /**
     * 获取固定期限范围（月） （上限） 
     * 
     * @return 固定期限范围（月） （上限） 
     */
    public String getZgxtxmqxfw() {
        return this.zgxtxmqxfw;
    }

    /**
     * 设置固定期限范围（月） （上限） 
     * 
     * @param zgxtxmqxfw
     *          固定期限范围（月） （上限） 
     */
    public void setZgxtxmqxfw(String zgxtxmqxfw) {
        this.zgxtxmqxfw = zgxtxmqxfw;
    }

    /**
     * 获取固定规模总范围 （万元）（上限） 
     * 
     * @return 固定规模总范围 （万元）（上限） 
     */
    public String getZggdgmzfw() {
        return this.zggdgmzfw;
    }

    /**
     * 设置固定规模总范围 （万元）（上限） 
     * 
     * @param zggdgmzfw
     *          固定规模总范围 （万元）（上限） 
     */
    public void setZggdgmzfw(String zggdgmzfw) {
        this.zggdgmzfw = zggdgmzfw;
    }

    /**
     * 获取固定期限总范围 （月）（上限） 
     * 
     * @return 固定期限总范围 （月）（上限） 
     */
    public String getZggdqxzfw() {
        return this.zggdqxzfw;
    }

    /**
     * 设置固定期限总范围 （月）（上限） 
     * 
     * @param zggdqxzfw
     *          固定期限总范围 （月）（上限） 
     */
    public void setZggdqxzfw(String zggdqxzfw) {
        this.zggdqxzfw = zggdqxzfw;
    }

    /**
     * 获取信托合同约定基准
收益率范围（上限）
 
     * 
     * @return 信托合同约定基准
收益率范围（上限）
 
     */
    public String getSyryqsylqjZd() {
        return this.syryqsylqjZd;
    }

    /**
     * 设置信托合同约定基准
收益率范围（上限）
 
     * 
     * @param syryqsylqjZd
     *          信托合同约定基准
收益率范围（上限）
 
     */
    public void setSyryqsylqjZd(String syryqsylqjZd) {
        this.syryqsylqjZd = syryqsylqjZd;
    }

    /**
     * 获取交易结构
     * 
     * @return 交易结构
     */
    public String getJyjg() {
        return this.jyjg;
    }

    /**
     * 设置交易结构
     * 
     * @param jyjg
     *          交易结构
     */
    public void setJyjg(String jyjg) {
        this.jyjg = jyjg;
    }

    /**
     * 获取风险预案说明
     * 
     * @return 风险预案说明
     */
    public String getFxyasm() {
        return this.fxyasm;
    }

    /**
     * 设置风险预案说明
     * 
     * @param fxyasm
     *          风险预案说明
     */
    public void setFxyasm(String fxyasm) {
        this.fxyasm = fxyasm;
    }
    
}