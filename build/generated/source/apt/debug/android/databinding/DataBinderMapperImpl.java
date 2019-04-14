package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new swivl.test.application.DataBinderMapperImpl());
  }
}
