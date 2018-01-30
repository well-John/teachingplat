package com.dgut.entity;

import java.util.ArrayList;
import java.util.List;

public class TeacherRequirementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherRequirementExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andConcatIsNull() {
            addCriterion("concat is null");
            return (Criteria) this;
        }

        public Criteria andConcatIsNotNull() {
            addCriterion("concat is not null");
            return (Criteria) this;
        }

        public Criteria andConcatEqualTo(String value) {
            addCriterion("concat =", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatNotEqualTo(String value) {
            addCriterion("concat <>", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatGreaterThan(String value) {
            addCriterion("concat >", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatGreaterThanOrEqualTo(String value) {
            addCriterion("concat >=", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatLessThan(String value) {
            addCriterion("concat <", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatLessThanOrEqualTo(String value) {
            addCriterion("concat <=", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatLike(String value) {
            addCriterion("concat like", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatNotLike(String value) {
            addCriterion("concat not like", value, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatIn(List<String> values) {
            addCriterion("concat in", values, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatNotIn(List<String> values) {
            addCriterion("concat not in", values, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatBetween(String value1, String value2) {
            addCriterion("concat between", value1, value2, "concat");
            return (Criteria) this;
        }

        public Criteria andConcatNotBetween(String value1, String value2) {
            addCriterion("concat not between", value1, value2, "concat");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionIsNull() {
            addCriterion("student_description is null");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionIsNotNull() {
            addCriterion("student_description is not null");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionEqualTo(String value) {
            addCriterion("student_description =", value, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionNotEqualTo(String value) {
            addCriterion("student_description <>", value, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionGreaterThan(String value) {
            addCriterion("student_description >", value, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("student_description >=", value, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionLessThan(String value) {
            addCriterion("student_description <", value, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionLessThanOrEqualTo(String value) {
            addCriterion("student_description <=", value, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionLike(String value) {
            addCriterion("student_description like", value, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionNotLike(String value) {
            addCriterion("student_description not like", value, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionIn(List<String> values) {
            addCriterion("student_description in", values, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionNotIn(List<String> values) {
            addCriterion("student_description not in", values, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionBetween(String value1, String value2) {
            addCriterion("student_description between", value1, value2, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentDescriptionNotBetween(String value1, String value2) {
            addCriterion("student_description not between", value1, value2, "studentDescription");
            return (Criteria) this;
        }

        public Criteria andStudentLevelIsNull() {
            addCriterion("student_level is null");
            return (Criteria) this;
        }

        public Criteria andStudentLevelIsNotNull() {
            addCriterion("student_level is not null");
            return (Criteria) this;
        }

        public Criteria andStudentLevelEqualTo(Integer value) {
            addCriterion("student_level =", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelNotEqualTo(Integer value) {
            addCriterion("student_level <>", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelGreaterThan(Integer value) {
            addCriterion("student_level >", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_level >=", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelLessThan(Integer value) {
            addCriterion("student_level <", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelLessThanOrEqualTo(Integer value) {
            addCriterion("student_level <=", value, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelIn(List<Integer> values) {
            addCriterion("student_level in", values, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelNotIn(List<Integer> values) {
            addCriterion("student_level not in", values, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelBetween(Integer value1, Integer value2) {
            addCriterion("student_level between", value1, value2, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andStudentLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("student_level not between", value1, value2, "studentLevel");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeIsNull() {
            addCriterion("teaching_time is null");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeIsNotNull() {
            addCriterion("teaching_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeEqualTo(String value) {
            addCriterion("teaching_time =", value, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeNotEqualTo(String value) {
            addCriterion("teaching_time <>", value, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeGreaterThan(String value) {
            addCriterion("teaching_time >", value, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_time >=", value, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeLessThan(String value) {
            addCriterion("teaching_time <", value, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeLessThanOrEqualTo(String value) {
            addCriterion("teaching_time <=", value, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeLike(String value) {
            addCriterion("teaching_time like", value, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeNotLike(String value) {
            addCriterion("teaching_time not like", value, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeIn(List<String> values) {
            addCriterion("teaching_time in", values, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeNotIn(List<String> values) {
            addCriterion("teaching_time not in", values, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeBetween(String value1, String value2) {
            addCriterion("teaching_time between", value1, value2, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andTeachingTimeNotBetween(String value1, String value2) {
            addCriterion("teaching_time not between", value1, value2, "teachingTime");
            return (Criteria) this;
        }

        public Criteria andRequireCountIsNull() {
            addCriterion("require_count is null");
            return (Criteria) this;
        }

        public Criteria andRequireCountIsNotNull() {
            addCriterion("require_count is not null");
            return (Criteria) this;
        }

        public Criteria andRequireCountEqualTo(Integer value) {
            addCriterion("require_count =", value, "requireCount");
            return (Criteria) this;
        }

        public Criteria andRequireCountNotEqualTo(Integer value) {
            addCriterion("require_count <>", value, "requireCount");
            return (Criteria) this;
        }

        public Criteria andRequireCountGreaterThan(Integer value) {
            addCriterion("require_count >", value, "requireCount");
            return (Criteria) this;
        }

        public Criteria andRequireCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("require_count >=", value, "requireCount");
            return (Criteria) this;
        }

        public Criteria andRequireCountLessThan(Integer value) {
            addCriterion("require_count <", value, "requireCount");
            return (Criteria) this;
        }

        public Criteria andRequireCountLessThanOrEqualTo(Integer value) {
            addCriterion("require_count <=", value, "requireCount");
            return (Criteria) this;
        }

        public Criteria andRequireCountIn(List<Integer> values) {
            addCriterion("require_count in", values, "requireCount");
            return (Criteria) this;
        }

        public Criteria andRequireCountNotIn(List<Integer> values) {
            addCriterion("require_count not in", values, "requireCount");
            return (Criteria) this;
        }

        public Criteria andRequireCountBetween(Integer value1, Integer value2) {
            addCriterion("require_count between", value1, value2, "requireCount");
            return (Criteria) this;
        }

        public Criteria andRequireCountNotBetween(Integer value1, Integer value2) {
            addCriterion("require_count not between", value1, value2, "requireCount");
            return (Criteria) this;
        }

        public Criteria andRequireSexIsNull() {
            addCriterion("require_sex is null");
            return (Criteria) this;
        }

        public Criteria andRequireSexIsNotNull() {
            addCriterion("require_sex is not null");
            return (Criteria) this;
        }

        public Criteria andRequireSexEqualTo(Integer value) {
            addCriterion("require_sex =", value, "requireSex");
            return (Criteria) this;
        }

        public Criteria andRequireSexNotEqualTo(Integer value) {
            addCriterion("require_sex <>", value, "requireSex");
            return (Criteria) this;
        }

        public Criteria andRequireSexGreaterThan(Integer value) {
            addCriterion("require_sex >", value, "requireSex");
            return (Criteria) this;
        }

        public Criteria andRequireSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("require_sex >=", value, "requireSex");
            return (Criteria) this;
        }

        public Criteria andRequireSexLessThan(Integer value) {
            addCriterion("require_sex <", value, "requireSex");
            return (Criteria) this;
        }

        public Criteria andRequireSexLessThanOrEqualTo(Integer value) {
            addCriterion("require_sex <=", value, "requireSex");
            return (Criteria) this;
        }

        public Criteria andRequireSexIn(List<Integer> values) {
            addCriterion("require_sex in", values, "requireSex");
            return (Criteria) this;
        }

        public Criteria andRequireSexNotIn(List<Integer> values) {
            addCriterion("require_sex not in", values, "requireSex");
            return (Criteria) this;
        }

        public Criteria andRequireSexBetween(Integer value1, Integer value2) {
            addCriterion("require_sex between", value1, value2, "requireSex");
            return (Criteria) this;
        }

        public Criteria andRequireSexNotBetween(Integer value1, Integer value2) {
            addCriterion("require_sex not between", value1, value2, "requireSex");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(Integer value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(Integer value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(Integer value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(Integer value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(Integer value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(Integer value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<Integer> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<Integer> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(Integer value1, Integer value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(Integer value1, Integer value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNull() {
            addCriterion("requirement is null");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNotNull() {
            addCriterion("requirement is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementEqualTo(String value) {
            addCriterion("requirement =", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotEqualTo(String value) {
            addCriterion("requirement <>", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThan(String value) {
            addCriterion("requirement >", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("requirement >=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThan(String value) {
            addCriterion("requirement <", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThanOrEqualTo(String value) {
            addCriterion("requirement <=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLike(String value) {
            addCriterion("requirement like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotLike(String value) {
            addCriterion("requirement not like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementIn(List<String> values) {
            addCriterion("requirement in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotIn(List<String> values) {
            addCriterion("requirement not in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementBetween(String value1, String value2) {
            addCriterion("requirement between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotBetween(String value1, String value2) {
            addCriterion("requirement not between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeIsNull() {
            addCriterion("teaching_type is null");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeIsNotNull() {
            addCriterion("teaching_type is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeEqualTo(String value) {
            addCriterion("teaching_type =", value, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeNotEqualTo(String value) {
            addCriterion("teaching_type <>", value, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeGreaterThan(String value) {
            addCriterion("teaching_type >", value, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_type >=", value, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeLessThan(String value) {
            addCriterion("teaching_type <", value, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeLessThanOrEqualTo(String value) {
            addCriterion("teaching_type <=", value, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeLike(String value) {
            addCriterion("teaching_type like", value, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeNotLike(String value) {
            addCriterion("teaching_type not like", value, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeIn(List<String> values) {
            addCriterion("teaching_type in", values, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeNotIn(List<String> values) {
            addCriterion("teaching_type not in", values, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeBetween(String value1, String value2) {
            addCriterion("teaching_type between", value1, value2, "teachingType");
            return (Criteria) this;
        }

        public Criteria andTeachingTypeNotBetween(String value1, String value2) {
            addCriterion("teaching_type not between", value1, value2, "teachingType");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceIsNull() {
            addCriterion("riding_allowance is null");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceIsNotNull() {
            addCriterion("riding_allowance is not null");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceEqualTo(Integer value) {
            addCriterion("riding_allowance =", value, "ridingAllowance");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceNotEqualTo(Integer value) {
            addCriterion("riding_allowance <>", value, "ridingAllowance");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceGreaterThan(Integer value) {
            addCriterion("riding_allowance >", value, "ridingAllowance");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("riding_allowance >=", value, "ridingAllowance");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceLessThan(Integer value) {
            addCriterion("riding_allowance <", value, "ridingAllowance");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceLessThanOrEqualTo(Integer value) {
            addCriterion("riding_allowance <=", value, "ridingAllowance");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceIn(List<Integer> values) {
            addCriterion("riding_allowance in", values, "ridingAllowance");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceNotIn(List<Integer> values) {
            addCriterion("riding_allowance not in", values, "ridingAllowance");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceBetween(Integer value1, Integer value2) {
            addCriterion("riding_allowance between", value1, value2, "ridingAllowance");
            return (Criteria) this;
        }

        public Criteria andRidingAllowanceNotBetween(Integer value1, Integer value2) {
            addCriterion("riding_allowance not between", value1, value2, "ridingAllowance");
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