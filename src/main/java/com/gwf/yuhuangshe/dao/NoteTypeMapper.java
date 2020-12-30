package com.gwf.yuhuangshe.dao;

import com.gwf.yuhuangshe.entity.NoteType;

import java.util.List;

public interface NoteTypeMapper {
    List<NoteType> selNoteTypes();
    int insertNoteType(NoteType noteType);
    int updateNoteTypeById(NoteType noteType);
    int delNoteTypeById(NoteType noteType);
    List<NoteType> selNoteTypeState();
}
