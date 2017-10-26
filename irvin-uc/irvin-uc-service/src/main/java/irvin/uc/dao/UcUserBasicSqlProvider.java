package irvin.uc.dao;

import irvin.api.domain.UcUserBasic;
import irvin.uc.common.domain.UcUserBasicExample.Criteria;
import irvin.uc.common.domain.UcUserBasicExample.Criterion;
import irvin.uc.common.domain.UcUserBasicExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UcUserBasicSqlProvider {

    public String countByExample(UcUserBasicExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("uc_user_basic");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UcUserBasicExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("uc_user_basic");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UcUserBasic record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("uc_user_basic");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.VALUES("age", "#{age,jdbcType=INTEGER}");
        }
        
        if (record.getBirth() != null) {
            sql.VALUES("birth", "#{birth,jdbcType=DATE}");
        }
        
        if (record.getMobile() != null) {
            sql.VALUES("mobile", "#{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.VALUES("gender", "#{gender,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getEnglishName() != null) {
            sql.VALUES("english_name", "#{englishName,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(UcUserBasicExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("age");
        sql.SELECT("birth");
        sql.SELECT("mobile");
        sql.SELECT("email");
        sql.SELECT("gender");
        sql.SELECT("status");
        sql.SELECT("english_name");
        sql.FROM("uc_user_basic");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(UcUserBasicExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("age");
        sql.SELECT("birth");
        sql.SELECT("mobile");
        sql.SELECT("email");
        sql.SELECT("gender");
        sql.SELECT("status");
        sql.FROM("uc_user_basic");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UcUserBasic record = (UcUserBasic) parameter.get("record");
        UcUserBasicExample example = (UcUserBasicExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("uc_user_basic");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("age = #{record.age,jdbcType=INTEGER}");
        }
        
        if (record.getBirth() != null) {
            sql.SET("birth = #{record.birth,jdbcType=DATE}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{record.gender,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{record.status,jdbcType=INTEGER}");
        }
        
        if (record.getEnglishName() != null) {
            sql.SET("english_name = #{record.englishName,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("uc_user_basic");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("age = #{record.age,jdbcType=INTEGER}");
        sql.SET("birth = #{record.birth,jdbcType=DATE}");
        sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("gender = #{record.gender,jdbcType=INTEGER}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        sql.SET("english_name = #{record.englishName,jdbcType=LONGVARCHAR}");
        
        UcUserBasicExample example = (UcUserBasicExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("uc_user_basic");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("age = #{record.age,jdbcType=INTEGER}");
        sql.SET("birth = #{record.birth,jdbcType=DATE}");
        sql.SET("mobile = #{record.mobile,jdbcType=VARCHAR}");
        sql.SET("email = #{record.email,jdbcType=VARCHAR}");
        sql.SET("gender = #{record.gender,jdbcType=INTEGER}");
        sql.SET("status = #{record.status,jdbcType=INTEGER}");
        
        UcUserBasicExample example = (UcUserBasicExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UcUserBasic record) {
        SQL sql = new SQL();
        sql.UPDATE("uc_user_basic");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("age = #{age,jdbcType=INTEGER}");
        }
        
        if (record.getBirth() != null) {
            sql.SET("birth = #{birth,jdbcType=DATE}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("mobile = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{gender,jdbcType=INTEGER}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getEnglishName() != null) {
            sql.SET("english_name = #{englishName,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UcUserBasicExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}