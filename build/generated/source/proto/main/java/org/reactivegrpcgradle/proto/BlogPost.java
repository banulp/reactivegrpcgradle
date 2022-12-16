// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog.proto

package org.reactivegrpcgradle.proto;

/**
 * Protobuf type {@code org.reactivegrpcgradle.proto.BlogPost}
 */
public final class BlogPost extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.reactivegrpcgradle.proto.BlogPost)
    BlogPostOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlogPost.newBuilder() to construct.
  private BlogPost(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlogPost() {
    title_ = "";
    content_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlogPost();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlogPost(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            content_ = s;
            break;
          }
          case 32: {

            createdAt_ = input.readInt64();
            break;
          }
          case 40: {

            modifiedAt_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.reactivegrpcgradle.proto.Blog.internal_static_org_reactivegrpcgradle_proto_BlogPost_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.reactivegrpcgradle.proto.Blog.internal_static_org_reactivegrpcgradle_proto_BlogPost_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.reactivegrpcgradle.proto.BlogPost.class, org.reactivegrpcgradle.proto.BlogPost.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_FIELD_NUMBER = 3;
  private volatile java.lang.Object content_;
  /**
   * <code>string content = 3;</code>
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   * <code>string content = 3;</code>
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATEDAT_FIELD_NUMBER = 4;
  private long createdAt_;
  /**
   * <code>int64 createdAt = 4;</code>
   * @return The createdAt.
   */
  @java.lang.Override
  public long getCreatedAt() {
    return createdAt_;
  }

  public static final int MODIFIEDAT_FIELD_NUMBER = 5;
  private long modifiedAt_;
  /**
   * <code>int64 modifiedAt = 5;</code>
   * @return The modifiedAt.
   */
  @java.lang.Override
  public long getModifiedAt() {
    return modifiedAt_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_);
    }
    if (createdAt_ != 0L) {
      output.writeInt64(4, createdAt_);
    }
    if (modifiedAt_ != 0L) {
      output.writeInt64(5, modifiedAt_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, content_);
    }
    if (createdAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, createdAt_);
    }
    if (modifiedAt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, modifiedAt_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.reactivegrpcgradle.proto.BlogPost)) {
      return super.equals(obj);
    }
    org.reactivegrpcgradle.proto.BlogPost other = (org.reactivegrpcgradle.proto.BlogPost) obj;

    if (getId()
        != other.getId()) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getContent()
        .equals(other.getContent())) return false;
    if (getCreatedAt()
        != other.getCreatedAt()) return false;
    if (getModifiedAt()
        != other.getModifiedAt()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + CREATEDAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreatedAt());
    hash = (37 * hash) + MODIFIEDAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getModifiedAt());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.reactivegrpcgradle.proto.BlogPost parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.reactivegrpcgradle.proto.BlogPost parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.reactivegrpcgradle.proto.BlogPost prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.reactivegrpcgradle.proto.BlogPost}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.reactivegrpcgradle.proto.BlogPost)
      org.reactivegrpcgradle.proto.BlogPostOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.reactivegrpcgradle.proto.Blog.internal_static_org_reactivegrpcgradle_proto_BlogPost_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.reactivegrpcgradle.proto.Blog.internal_static_org_reactivegrpcgradle_proto_BlogPost_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.reactivegrpcgradle.proto.BlogPost.class, org.reactivegrpcgradle.proto.BlogPost.Builder.class);
    }

    // Construct using org.reactivegrpcgradle.proto.BlogPost.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      title_ = "";

      content_ = "";

      createdAt_ = 0L;

      modifiedAt_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.reactivegrpcgradle.proto.Blog.internal_static_org_reactivegrpcgradle_proto_BlogPost_descriptor;
    }

    @java.lang.Override
    public org.reactivegrpcgradle.proto.BlogPost getDefaultInstanceForType() {
      return org.reactivegrpcgradle.proto.BlogPost.getDefaultInstance();
    }

    @java.lang.Override
    public org.reactivegrpcgradle.proto.BlogPost build() {
      org.reactivegrpcgradle.proto.BlogPost result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.reactivegrpcgradle.proto.BlogPost buildPartial() {
      org.reactivegrpcgradle.proto.BlogPost result = new org.reactivegrpcgradle.proto.BlogPost(this);
      result.id_ = id_;
      result.title_ = title_;
      result.content_ = content_;
      result.createdAt_ = createdAt_;
      result.modifiedAt_ = modifiedAt_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.reactivegrpcgradle.proto.BlogPost) {
        return mergeFrom((org.reactivegrpcgradle.proto.BlogPost)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.reactivegrpcgradle.proto.BlogPost other) {
      if (other == org.reactivegrpcgradle.proto.BlogPost.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (other.getCreatedAt() != 0L) {
        setCreatedAt(other.getCreatedAt());
      }
      if (other.getModifiedAt() != 0L) {
        setModifiedAt(other.getModifiedAt());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.reactivegrpcgradle.proto.BlogPost parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.reactivegrpcgradle.proto.BlogPost) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     * <code>string content = 3;</code>
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string content = 3;</code>
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string content = 3;</code>
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string content = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     * <code>string content = 3;</code>
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      content_ = value;
      onChanged();
      return this;
    }

    private long createdAt_ ;
    /**
     * <code>int64 createdAt = 4;</code>
     * @return The createdAt.
     */
    @java.lang.Override
    public long getCreatedAt() {
      return createdAt_;
    }
    /**
     * <code>int64 createdAt = 4;</code>
     * @param value The createdAt to set.
     * @return This builder for chaining.
     */
    public Builder setCreatedAt(long value) {
      
      createdAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 createdAt = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCreatedAt() {
      
      createdAt_ = 0L;
      onChanged();
      return this;
    }

    private long modifiedAt_ ;
    /**
     * <code>int64 modifiedAt = 5;</code>
     * @return The modifiedAt.
     */
    @java.lang.Override
    public long getModifiedAt() {
      return modifiedAt_;
    }
    /**
     * <code>int64 modifiedAt = 5;</code>
     * @param value The modifiedAt to set.
     * @return This builder for chaining.
     */
    public Builder setModifiedAt(long value) {
      
      modifiedAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 modifiedAt = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearModifiedAt() {
      
      modifiedAt_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.reactivegrpcgradle.proto.BlogPost)
  }

  // @@protoc_insertion_point(class_scope:org.reactivegrpcgradle.proto.BlogPost)
  private static final org.reactivegrpcgradle.proto.BlogPost DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.reactivegrpcgradle.proto.BlogPost();
  }

  public static org.reactivegrpcgradle.proto.BlogPost getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlogPost>
      PARSER = new com.google.protobuf.AbstractParser<BlogPost>() {
    @java.lang.Override
    public BlogPost parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlogPost(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlogPost> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlogPost> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.reactivegrpcgradle.proto.BlogPost getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

