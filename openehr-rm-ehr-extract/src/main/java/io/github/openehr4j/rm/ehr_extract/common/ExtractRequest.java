package io.github.openehr4j.rm.ehr_extract.common;

import org.openehr.base.base_types.identification.HierObjectId;
import io.github.openehr4j.rm.common.archetyped.Locatable;

public interface ExtractRequest extends Locatable {

  ExtractSpec getExtractSpec();

  ExtractUpdateSpec getUpdateSpec();

  HierObjectId getUid();
}