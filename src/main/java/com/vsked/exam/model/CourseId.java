package com.vsked.exam.model;

import com.vsked.exam.shared.ValueObject;
import org.apache.commons.lang3.Validate;

public class CourseId implements ValueObject<CourseId> {

    private long courseId;

    @Override
    public boolean sameValueAs(CourseId other) {
        return other!=null && this.courseId==other.courseId;
    }

    public CourseId(long courseId){
        Validate.notNull(courseId);
        this.courseId=courseId;
    }

    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null) return false;
        if(!(o instanceof CourseId)) return false;
        final CourseId other=(CourseId)o;
        return sameValueAs(other);
    }

    public int hashCode(){
        return (courseId+"").hashCode();
    }

    public String toString(){
        return courseId+"";
    }

    public String idString(){
        return courseId+"";
    }
}
