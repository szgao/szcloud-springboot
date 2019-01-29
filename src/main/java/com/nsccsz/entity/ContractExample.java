package com.nsccsz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEmployerIsNull() {
            addCriterion("employer is null");
            return (Criteria) this;
        }

        public Criteria andEmployerIsNotNull() {
            addCriterion("employer is not null");
            return (Criteria) this;
        }

        public Criteria andEmployerEqualTo(String value) {
            addCriterion("employer =", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotEqualTo(String value) {
            addCriterion("employer <>", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerGreaterThan(String value) {
            addCriterion("employer >", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerGreaterThanOrEqualTo(String value) {
            addCriterion("employer >=", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerLessThan(String value) {
            addCriterion("employer <", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerLessThanOrEqualTo(String value) {
            addCriterion("employer <=", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerLike(String value) {
            addCriterion("employer like", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotLike(String value) {
            addCriterion("employer not like", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerIn(List<String> values) {
            addCriterion("employer in", values, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotIn(List<String> values) {
            addCriterion("employer not in", values, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerBetween(String value1, String value2) {
            addCriterion("employer between", value1, value2, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotBetween(String value1, String value2) {
            addCriterion("employer not between", value1, value2, "employer");
            return (Criteria) this;
        }

        public Criteria andUseraidIsNull() {
            addCriterion("userAid is null");
            return (Criteria) this;
        }

        public Criteria andUseraidIsNotNull() {
            addCriterion("userAid is not null");
            return (Criteria) this;
        }

        public Criteria andUseraidEqualTo(Integer value) {
            addCriterion("userAid =", value, "useraid");
            return (Criteria) this;
        }

        public Criteria andUseraidNotEqualTo(Integer value) {
            addCriterion("userAid <>", value, "useraid");
            return (Criteria) this;
        }

        public Criteria andUseraidGreaterThan(Integer value) {
            addCriterion("userAid >", value, "useraid");
            return (Criteria) this;
        }

        public Criteria andUseraidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userAid >=", value, "useraid");
            return (Criteria) this;
        }

        public Criteria andUseraidLessThan(Integer value) {
            addCriterion("userAid <", value, "useraid");
            return (Criteria) this;
        }

        public Criteria andUseraidLessThanOrEqualTo(Integer value) {
            addCriterion("userAid <=", value, "useraid");
            return (Criteria) this;
        }

        public Criteria andUseraidIn(List<Integer> values) {
            addCriterion("userAid in", values, "useraid");
            return (Criteria) this;
        }

        public Criteria andUseraidNotIn(List<Integer> values) {
            addCriterion("userAid not in", values, "useraid");
            return (Criteria) this;
        }

        public Criteria andUseraidBetween(Integer value1, Integer value2) {
            addCriterion("userAid between", value1, value2, "useraid");
            return (Criteria) this;
        }

        public Criteria andUseraidNotBetween(Integer value1, Integer value2) {
            addCriterion("userAid not between", value1, value2, "useraid");
            return (Criteria) this;
        }

        public Criteria andLaborerIsNull() {
            addCriterion("laborer is null");
            return (Criteria) this;
        }

        public Criteria andLaborerIsNotNull() {
            addCriterion("laborer is not null");
            return (Criteria) this;
        }

        public Criteria andLaborerEqualTo(String value) {
            addCriterion("laborer =", value, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerNotEqualTo(String value) {
            addCriterion("laborer <>", value, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerGreaterThan(String value) {
            addCriterion("laborer >", value, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerGreaterThanOrEqualTo(String value) {
            addCriterion("laborer >=", value, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerLessThan(String value) {
            addCriterion("laborer <", value, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerLessThanOrEqualTo(String value) {
            addCriterion("laborer <=", value, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerLike(String value) {
            addCriterion("laborer like", value, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerNotLike(String value) {
            addCriterion("laborer not like", value, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerIn(List<String> values) {
            addCriterion("laborer in", values, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerNotIn(List<String> values) {
            addCriterion("laborer not in", values, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerBetween(String value1, String value2) {
            addCriterion("laborer between", value1, value2, "laborer");
            return (Criteria) this;
        }

        public Criteria andLaborerNotBetween(String value1, String value2) {
            addCriterion("laborer not between", value1, value2, "laborer");
            return (Criteria) this;
        }

        public Criteria andUserbidIsNull() {
            addCriterion("userBid is null");
            return (Criteria) this;
        }

        public Criteria andUserbidIsNotNull() {
            addCriterion("userBid is not null");
            return (Criteria) this;
        }

        public Criteria andUserbidEqualTo(Integer value) {
            addCriterion("userBid =", value, "userbid");
            return (Criteria) this;
        }

        public Criteria andUserbidNotEqualTo(Integer value) {
            addCriterion("userBid <>", value, "userbid");
            return (Criteria) this;
        }

        public Criteria andUserbidGreaterThan(Integer value) {
            addCriterion("userBid >", value, "userbid");
            return (Criteria) this;
        }

        public Criteria andUserbidGreaterThanOrEqualTo(Integer value) {
            addCriterion("userBid >=", value, "userbid");
            return (Criteria) this;
        }

        public Criteria andUserbidLessThan(Integer value) {
            addCriterion("userBid <", value, "userbid");
            return (Criteria) this;
        }

        public Criteria andUserbidLessThanOrEqualTo(Integer value) {
            addCriterion("userBid <=", value, "userbid");
            return (Criteria) this;
        }

        public Criteria andUserbidIn(List<Integer> values) {
            addCriterion("userBid in", values, "userbid");
            return (Criteria) this;
        }

        public Criteria andUserbidNotIn(List<Integer> values) {
            addCriterion("userBid not in", values, "userbid");
            return (Criteria) this;
        }

        public Criteria andUserbidBetween(Integer value1, Integer value2) {
            addCriterion("userBid between", value1, value2, "userbid");
            return (Criteria) this;
        }

        public Criteria andUserbidNotBetween(Integer value1, Integer value2) {
            addCriterion("userBid not between", value1, value2, "userbid");
            return (Criteria) this;
        }

        public Criteria andCorenessIsNull() {
            addCriterion("coreness is null");
            return (Criteria) this;
        }

        public Criteria andCorenessIsNotNull() {
            addCriterion("coreness is not null");
            return (Criteria) this;
        }

        public Criteria andCorenessEqualTo(String value) {
            addCriterion("coreness =", value, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessNotEqualTo(String value) {
            addCriterion("coreness <>", value, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessGreaterThan(String value) {
            addCriterion("coreness >", value, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessGreaterThanOrEqualTo(String value) {
            addCriterion("coreness >=", value, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessLessThan(String value) {
            addCriterion("coreness <", value, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessLessThanOrEqualTo(String value) {
            addCriterion("coreness <=", value, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessLike(String value) {
            addCriterion("coreness like", value, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessNotLike(String value) {
            addCriterion("coreness not like", value, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessIn(List<String> values) {
            addCriterion("coreness in", values, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessNotIn(List<String> values) {
            addCriterion("coreness not in", values, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessBetween(String value1, String value2) {
            addCriterion("coreness between", value1, value2, "coreness");
            return (Criteria) this;
        }

        public Criteria andCorenessNotBetween(String value1, String value2) {
            addCriterion("coreness not between", value1, value2, "coreness");
            return (Criteria) this;
        }

        public Criteria andMonthlyIsNull() {
            addCriterion("monthly is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyIsNotNull() {
            addCriterion("monthly is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyEqualTo(String value) {
            addCriterion("monthly =", value, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyNotEqualTo(String value) {
            addCriterion("monthly <>", value, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyGreaterThan(String value) {
            addCriterion("monthly >", value, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyGreaterThanOrEqualTo(String value) {
            addCriterion("monthly >=", value, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyLessThan(String value) {
            addCriterion("monthly <", value, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyLessThanOrEqualTo(String value) {
            addCriterion("monthly <=", value, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyLike(String value) {
            addCriterion("monthly like", value, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyNotLike(String value) {
            addCriterion("monthly not like", value, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyIn(List<String> values) {
            addCriterion("monthly in", values, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyNotIn(List<String> values) {
            addCriterion("monthly not in", values, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyBetween(String value1, String value2) {
            addCriterion("monthly between", value1, value2, "monthly");
            return (Criteria) this;
        }

        public Criteria andMonthlyNotBetween(String value1, String value2) {
            addCriterion("monthly not between", value1, value2, "monthly");
            return (Criteria) this;
        }

        public Criteria andHoursIsNull() {
            addCriterion("hours is null");
            return (Criteria) this;
        }

        public Criteria andHoursIsNotNull() {
            addCriterion("hours is not null");
            return (Criteria) this;
        }

        public Criteria andHoursEqualTo(String value) {
            addCriterion("hours =", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotEqualTo(String value) {
            addCriterion("hours <>", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThan(String value) {
            addCriterion("hours >", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursGreaterThanOrEqualTo(String value) {
            addCriterion("hours >=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThan(String value) {
            addCriterion("hours <", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLessThanOrEqualTo(String value) {
            addCriterion("hours <=", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursLike(String value) {
            addCriterion("hours like", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotLike(String value) {
            addCriterion("hours not like", value, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursIn(List<String> values) {
            addCriterion("hours in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotIn(List<String> values) {
            addCriterion("hours not in", values, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursBetween(String value1, String value2) {
            addCriterion("hours between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andHoursNotBetween(String value1, String value2) {
            addCriterion("hours not between", value1, value2, "hours");
            return (Criteria) this;
        }

        public Criteria andStoreIsNull() {
            addCriterion("store is null");
            return (Criteria) this;
        }

        public Criteria andStoreIsNotNull() {
            addCriterion("store is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEqualTo(String value) {
            addCriterion("store =", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotEqualTo(String value) {
            addCriterion("store <>", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThan(String value) {
            addCriterion("store >", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThanOrEqualTo(String value) {
            addCriterion("store >=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThan(String value) {
            addCriterion("store <", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThanOrEqualTo(String value) {
            addCriterion("store <=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLike(String value) {
            addCriterion("store like", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotLike(String value) {
            addCriterion("store not like", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreIn(List<String> values) {
            addCriterion("store in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotIn(List<String> values) {
            addCriterion("store not in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreBetween(String value1, String value2) {
            addCriterion("store between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotBetween(String value1, String value2) {
            addCriterion("store not between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("projectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("projectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("projectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("projectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("projectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("projectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("projectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("projectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("projectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("projectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("projectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("projectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("projectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("projectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andFieldIsNull() {
            addCriterion("field is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsNotNull() {
            addCriterion("field is not null");
            return (Criteria) this;
        }

        public Criteria andFieldEqualTo(String value) {
            addCriterion("field =", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotEqualTo(String value) {
            addCriterion("field <>", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThan(String value) {
            addCriterion("field >", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThanOrEqualTo(String value) {
            addCriterion("field >=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThan(String value) {
            addCriterion("field <", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThanOrEqualTo(String value) {
            addCriterion("field <=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLike(String value) {
            addCriterion("field like", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotLike(String value) {
            addCriterion("field not like", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldIn(List<String> values) {
            addCriterion("field in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotIn(List<String> values) {
            addCriterion("field not in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldBetween(String value1, String value2) {
            addCriterion("field between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotBetween(String value1, String value2) {
            addCriterion("field not between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}