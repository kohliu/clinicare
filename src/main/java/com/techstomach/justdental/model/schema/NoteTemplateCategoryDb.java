package com.techstomach.justdental.model.schema;
// Generated Nov 19, 2016 4:08:03 PM by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * NoteTemplateCategoryDb generated by hbm2java
 */
@Entity
@Table(name = "note_template_category_db", catalog = "jd_database")
public class NoteTemplateCategoryDb implements java.io.Serializable {

	private Integer noteTemplateCategoryId;
	private String templateCategoryName;
	private List<TemplateDb> templateDbs;

	public NoteTemplateCategoryDb() {
	}

	public NoteTemplateCategoryDb(String templateCategoryName) {
		this.templateCategoryName = templateCategoryName;
	}

	public NoteTemplateCategoryDb(String templateCategoryName, List<TemplateDb> templateDbs) {
		this.templateCategoryName = templateCategoryName;
		this.templateDbs = templateDbs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "NoteTemplateCategoryID", unique = true, nullable = false)
	public Integer getNoteTemplateCategoryId() {
		return this.noteTemplateCategoryId;
	}

	public void setNoteTemplateCategoryId(Integer noteTemplateCategoryId) {
		this.noteTemplateCategoryId = noteTemplateCategoryId;
	}

	@Column(name = "TemplateCategoryName", nullable = false, length = 30)
	public String getTemplateCategoryName() {
		return this.templateCategoryName;
	}

	public void setTemplateCategoryName(String templateCategoryName) {
		this.templateCategoryName = templateCategoryName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "noteTemplateCategoryDb")
	public List<TemplateDb> getTemplateDbs() {
		return this.templateDbs;
	}

	public void setTemplateDbs(List<TemplateDb> templateDbs) {
		this.templateDbs = templateDbs;
	}
}
