package com.gwf.yuhuangshe.dao;

import com.gwf.yuhuangshe.entity.Notes;
import com.gwf.yuhuangshe.entity.Relation;

import java.util.List;

public interface NotesMapper {
    List<Notes> selNotes(Integer UId);
    int insertNote(Notes notes);
    int updateNoteById(Notes notes);
    int delNoteById(Notes notes);
}
